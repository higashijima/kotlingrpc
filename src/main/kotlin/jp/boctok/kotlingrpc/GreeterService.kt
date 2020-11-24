package jp.boctok.kotlingrpc

import jp.boctok.kotlingrpc.greeter.proto.GreeterGrpc
import jp.boctok.kotlingrpc.greeter.proto.GreeterProtobuf
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver

@GRpcService
class GreeterService: GreeterGrpc.GreeterImplBase() {
    override fun sayHello(request: GreeterProtobuf.HelloRequest, responseObserver: StreamObserver<GreeterProtobuf.HelloReply>){
        val replyBuilder = GreeterProtobuf.HelloReply.newBuilder().setMessage("Hello " + request.name)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}