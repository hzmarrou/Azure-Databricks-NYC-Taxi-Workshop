// Databricks notebook source
// MAGIC %md
// MAGIC # Secure your Azure Cosmos DB credentials with Databricks secrets
// MAGIC 
// MAGIC Secrets allow you to secure your credentials, and reference in your code instead of hard-code.  Databricks automatically redacts secrets from being displayed in the notebook as cleartext.<BR>
// MAGIC   
// MAGIC **Pre-requisite**: <br>
// MAGIC 1.  You should have created your Azure Cosmos DB account.<br>
// MAGIC   
// MAGIC   
// MAGIC In this notebook, we will -<br>
// MAGIC   1.  Install Dataricks CLI if not already installed
// MAGIC   2.  Secure credentials

// COMMAND ----------

// MAGIC %md
// MAGIC ## 1. Install Databricks CLI on your Linux terminal

// COMMAND ----------

// MAGIC %md
// MAGIC Follow instructions from the CLI setup notebook in the Azure storage primr module.

// COMMAND ----------

// MAGIC %md
// MAGIC ## 2. Secure your Cosmos DB credentials

// COMMAND ----------

// MAGIC %md
// MAGIC #### 2.0.1. Create a secrets scope for your account
// MAGIC You can name it per your preference.

// COMMAND ----------

// MAGIC %md
// MAGIC ```databricks secrets create-scope --scope gws-cosmos-db```

// COMMAND ----------

// MAGIC %md
// MAGIC #### 2.0.2. Set up your account key and account URI within the secret scope

// COMMAND ----------

// MAGIC %md
// MAGIC ```databricks secrets put --scope gws-cosmos-db --key acct-key```

// COMMAND ----------

// MAGIC %md
// MAGIC This will open a file for you to enter in your account key.  Save and close the file and your secret is saved.

// COMMAND ----------

// MAGIC %md
// MAGIC ```databricks secrets put --scope gws-cosmos-db --key acct-uri```

// COMMAND ----------

// MAGIC %md
// MAGIC This will open a file for you to enter in your account uri.  Save and close the file and your secret is saved.

// COMMAND ----------

// MAGIC %md
// MAGIC #### 2.0.3. List your secret scopes

// COMMAND ----------

// MAGIC %md
// MAGIC ```databricks secrets list-scopes```

// COMMAND ----------

// MAGIC %md You should see the scope created.

// COMMAND ----------

// MAGIC %md
// MAGIC #### 2.0.4. List the secrets within the scope created

// COMMAND ----------

// MAGIC %md ```databricks secrets list --scope gws-cosmos-db```

// COMMAND ----------

// MAGIC %md You should see the secret created.