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
        sh 'echo bonjour'
        bat 'dir'
      }
    }
  }
  environment {
    qfgqsfs = 'sdfqf'
  }
}