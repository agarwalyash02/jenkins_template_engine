void call(){
    stage('get_env') {
        node {
            sh 'echo hello'
            sh 'echo hey'
        }
        node {
            sh 'echo hell'
            sh 'echo he'
        }
    }
}

// void call(){
//     println "maven: build()"
// }