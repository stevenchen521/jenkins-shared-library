#!/usr/bin/env groovy


def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable:'PASS', usernameVariable:'USER')]){
        sh 'docker build -t stevenchen521/demo-app:jma-2.0 ./module-8/java-maven-app'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push stevenchen521/demo-app:jma-2.0'
    }
}