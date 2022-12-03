#!/usr/bin/env groovy

def call(){
    echo "build the application..."
    sh 'mvn package'

}