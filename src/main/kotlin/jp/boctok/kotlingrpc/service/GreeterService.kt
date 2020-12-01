package jp.boctok.kotlingrpc.greeter.proto

import jp.boctok.kotlingrpc.greeter.proto.GreeterGrpc
import jp.boctok.kotlingrpc.greeter.proto.GreeterOuterClass
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver

@GRpcService
class GreeterService: GreeterGrpc.GreeterImplBase() {
    override fun sayHello(request: GreeterOuterClass.HelloRequest, responseObserver: StreamObserver<GreeterOuterClass.HelloReply>){
        var name = if("".equals(request.name)) "blank name" else if(request.name==null) "no name" else request.name
//        val replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage("Hello " + name)
        var age = if("".equals(request.age)) "blank name" else if(request.age==null) "no name" else request.age
        val replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage("Hello " + name + "/you're " + age)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}