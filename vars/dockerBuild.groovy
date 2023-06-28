// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      docker image build -t ${hubUser}/${project} . 
//      docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
//      docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
//     """
// }

def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker build -t sam .
     docker tag sam:latest 296784826342.dkr.ecr.us-west-1.amazonaws.com/sam:latest
    """
}
