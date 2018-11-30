pipeline {
  agent {
    node {
      label 'build2'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('est') {
      steps {
        sleep 1
      }
    }
    stage('test3') {
      steps {
        sleep 2
      }
    }
  }
}