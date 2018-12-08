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
        bat 'mvn install package'
      }
    }
  }
  environment {
    qfgqsfs = 'sdfqf'
  }
}