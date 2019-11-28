### Getting started

Create an account named  **sqs-account** and this permissions **AmazonSQSFullAccess, AWSCloudFormationFullAccess** in your IAM section from your aws console.

### 1. Create a profile into AWS CLI using this command

    aws configure --profile sqs-account
    
    AWS Access Key ID [None]: ENTER_YOUR_ACCESS_KEY
    AWS Secret Access Key [None]: ENTER_YOUR_SECRET_KEY
    Default region name [None]: ENTER_USER_REGION
    Default output format [None]: PRESS ENTER    


### 2. Delete the **user-sqs** stack if exists

    aws cloudformation delete-stack  --stack-name user-sqs --profile sqs-account


### 3. Create **user-sqs** stack into aws

    aws cloudformation create-stack  --stack-name user-sqs --template-body file://cloudformation/user-sqs.yml --profile ses-account
