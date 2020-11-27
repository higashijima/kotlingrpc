package jp.boctok.kotlingrpc.greeter.proto

import jp.boctok.kotlingrpc.greeter.proto.GreeterGrpc
import jp.boctok.kotlingrpc.greeter.proto.GreeterOuterClass
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver

@GRpcService
class GreeterService: GreeterGrpc.GreeterImplBase() {
    override fun sayHello(request: GreeterOuterClass.HelloRequest, responseObserver: StreamObserver<GreeterOuterClass.HelloReply>){
        val replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage("Hello " + request.name)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}