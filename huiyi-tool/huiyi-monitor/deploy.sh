#!/bin/bash
# 此脚本可用来本地打包并构建镜像,并在服务器启动

image=huiyi-monitor-svc
dockerHost=tcp://121.40.95.165:8375
port=5001

# mvn打包项目
#mvn clean install -DskipTests
docker -H $dockerHost build -t $image .
docker -H $dockerHost kill $image
docker -H $dockerHost rm $image
docker -H $dockerHost run -d --name $image -p $port:$port $image