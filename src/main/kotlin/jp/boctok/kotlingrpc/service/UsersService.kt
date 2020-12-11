package jp.boctok.kotlingrpc.service

import jp.boctok.kotlingrpc.greeter.proto.GreeterGrpc
import jp.boctok.kotlingrpc.greeter.proto.GreeterOuterClass
import io.grpc.stub.StreamObserver
import jp.boctok.kotlingrpc.mapper.UsersMapper
import jp.boctok.kotlingrpc.users.proto.UsersGrpc
import jp.boctok.kotlingrpc.users.proto.UsersOuterClass
import org.lognet.springboot.grpc.GRpcService
import java.io.InputStream
import java.nio.file.Files

@GRpcService
class UsersService: UsersGrpc.UsersImplBase() {
    override fun userInfo(
        request: UsersOuterClass.UsersRequest,
        responseObserver: StreamObserver<UsersOuterClass.UsersResponse>
    ) {
        val user: UsersOuterClass.UsersResponse = UsersOuterClass.UsersResponse.getDefaultInstance()
        val selectList = UsersMapper.select(request.id)
        var name = if("".equals(request.name)) "blank name" else if(request.name==null) "no name" else request.name
        var id = if("".equals(request.id)) "blank name" else if(request.id==null) "no name" else request.id
        val replyBuilder = UsersOuterClass.UsersResponse.newBuilder().setMessage("Hello " + name + "/id " + id)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}