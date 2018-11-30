pipeline {
  agent none
  stages {
    stage('manger') {
      steps {
        sleep 10
        sh 'ls'
      }
    }
    stage('test1') {
      parallel {
        stage('test1') {
          steps {
            sleep 1
          }
        }
        stage('para1') {
          steps {
            sleep 5
          }
        }
        stage('paralelle2') {
          steps {
            sleep 10
          }
        }
      }
    }
    stage('test2') {
      steps {
        sleep 3
      }
    }
  }
  environment {
    qfgqsfs = 'sdfqf'
  }
}