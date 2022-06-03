void call() {
    stage('Clone') {
            node {
                sh 'echo helloStarting from firmwide steps clone'
                git branch: '$branch', url: '$repoURL'
            }
    }
}