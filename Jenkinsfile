pipeline {
  agent any
  stages {
    stage('pull git') {
      steps {
        git(url: 'https://github.com/ledormeurz/weegle.git', branch: 'master')
      }
    }
    stage('build weegle a') {
      steps {
        sh '''ls
KUBECONFIG=C:\\Users\\cedco\\.kube

mvn clean
ls
cd ./master/weegle-a
echo IMAGE_NAME = "cedcori/weegle-a:${BUILD_NUMBER}"
echo %IMAGE_NAME%
echo ${IMAGE_NAME}
ls
mvn install package
cd ./target
ls
docker build . -t cedcori/weegle-a:${BUILD_NUMBER}
docker login -u cedcori -p bonjourK6+
docker push cedcori/weegle-a:${BUILD_NUMBER}'''
      }
    }
  }
  environment {
    qfgqsfs = 'sdfqf'
  }
}