Algorithm:

Step 1:

Import the reverse geocoding library for Java.
For each year from 1965 to 2016, do the following:
a. Get the earthquake data for the year.
b. For each earthquake, get its latitude and longitude.
c. Use the reverse geocoding library to get the city and country name from the latitude and longitude.
d. Store the earthquake data along with its magnitude, city and country name in the collection for the year.
Step 2:

Create a priority queue to store the biggest earthquake of each year.
For each year from 1965 to 2016, do the following:
a. Get the collection of earthquakes for the year.
b. Find the earthquake with the highest magnitude.
c. Add the earthquake to the priority queue with its magnitude and country name.
Step 3:

Create a stack for each country.
For each year from 1965 to 2016, do the following:
a. Get the collection of earthquakes for the year.
b. For each earthquake, get its country name.
c. Push the earthquake and its magnitude onto the stack for the country.
Step 4:

Create a linked list to store the most recent earthquake for each country.
For each country, do the following:
a. Pop the most recent earthquake from the stack for the country.
b. Add the earthquake to the linked list with its magnitude and country name.
Return the linked list with the most recent earthquake for each country.



