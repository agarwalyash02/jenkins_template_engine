void call(){
    // if (config.envName == "dev"){
    //     stage('print service env'){
    //         node{
    //             echo "hello"
    //             sh 'printenv'
    //         }
    //     }
    // }
    stage('print using echo') {
        node {
            sh 'echo helloStarting'
            println config.envName
            sh 'echo $envName'
            git branch: '$branch', url: '$repoURL'
            sh 'ls'
            // sh 'echo "${env.envName}"'
        }
        // node {
        //     sh 'echo heyEnding'
        //     sh 'echo $service'
        // }
    }
    
    // stage('print env') {
    //         node {
    //             sh 'echo byeStarting'
    //             println config.envName
    //         }
    //         node {
    //             sh 'echo byeeeEnding'
    //         }
    //     }
}
