pipeline{
    agent any
    stages{
        stage("Upload Artifact"){
                    environment{
                        MAVEN_HOME = '/usr/share/maven'
                    }
            steps{
                echo "-------Uploading Artifact--------"
            
                rtMavenDeployer (
                    id:'IS_P2_MAIN',
                    serverId: 'artifactory',
                    releaseRepo: 'parcial2',
                    snapshotRepo: 'parcial2',
                )
     
rtMavenRun(
                    pom: 'pom.xml',
                    goals: 'install',
                    deployerId: 'IS_P2_MAIN'
                )

                    echo "-----Deploying Finished-----"
            }
        }
        stage ("Artifactory Information") {
            steps{
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
    }
}