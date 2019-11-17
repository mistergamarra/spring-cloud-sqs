# Previous Considerations

Using profile : **[cf-user]** and added permissions : **[AmazonSQSFullAccess, AWSCloudFormationFullAccess]**


## Delete the **user-sqs** stack if exists

    aws cloudformation delete-stack  --stack-name user-sqs --profile cf-user


## Create **user-sqs** stack into aws


    aws cloudformation create-stack  --stack-name user-sqs --template-body file://sqs.yml --profile cf-user
