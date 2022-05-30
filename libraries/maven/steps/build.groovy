void call(app_name){
    stage('print using echo') {
        node {
            sh 'echo hello'
            sh 'echo hey'
            println config.envName
            println "${app_name.eName}"
        }
        node {
            sh 'echo hell'
            sh 'echo he'
        }
    }
    stage('print env var') {
        node {
            sh 'echo hello'
            sh 'echo hey'
        }
    }
}

// void call(){
//     println "maven: build()"
// }