A configurable customer reward workflow.

When users take actions, certain events will be generated, which will be processed and put user in different workflow state.

# Requirements:
- the workflow should be driven by configurations rater than hard-coded
- each event processing should be idempotent (only process once)
- create a DataStore interface, implement an in memory data store for testing purpose, create stub classes for DynamoDB, AWS RDP database and AWS S3.
- implement unit tests with Junit 5