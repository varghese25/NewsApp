1. User Input
Prompt: The program prompts the user to enter a category of news they are interested in (e.g., sports, technology, business).
Input: The user enters a category.
2. Construct API URL
Base URL: The base URL for the NewsAPI is https://newsapi.org/v2/top-headlines?.
Parameters: The user input (category), language (en), and API key are appended to the base URL to form the complete API URL.
3. Establish Connection
HTTP Connection: An HttpURLConnection object is created using the constructed API URL.
Request Method: The request method is set to GET to fetch data from the API.
4. Fetch Response
BufferedReader: The response from the API is read using a BufferedReader.
JSON String: The response is read line by line and concatenated into a single JSON string.
5. Parse JSON Response
Extract Titles: The JSON string is parsed to extract the titles of news articles.
Print Titles: The extracted titles are printed to the console.
6. Error Handling
Exception Handling: Any exceptions that occur during the process are caught and printed to the console.
Creating an API Key
To create an API key:

Click the link to visit the News API official website.
Click the "Generate API Key" button.
Enter your email and password, then submit.
Copy the API key and paste it into your program.
