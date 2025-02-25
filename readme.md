A configurable customer reward workflow.

When users take actions, certain events will be generated, which will be processed and put user in different workflow state.

# Requirements:
- the workflow should be driven by configurations rater than hard-coded
- each event processing should be idempotent