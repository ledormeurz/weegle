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
        bat 'dir'
        bat 'cd ./master/weegle-a'
        dir(path: './master/weegle-a') {
          bat 'dir'
          bat 'mvn clean package'
        }

      }
    }
  }
  environment {
    qfgqsfs = 'sdfqf'
  }
}