# Pre-work - *Simple To-do List*

**Simple To-do List** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Pamela Lu**

Time spent: **15** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [x] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://cvws.icloud-content.com/B/AYEXFGREru0PrdhXFkxKiC9hb6XtAfErH1mhYyuOP9N_4iGXXXwVA4sN/SimpleTodo_v1.gif?o=Ai69q8afntTwL57duU9pqe5BGHyN-9dBxVnmdxXKCMvu&v=1&x=3&a=BZuIrRoATAn9A-_nPA&e=1501796079&k=PKJNJVgofFdDBDikrsZ15g&fl=&r=37552f5e-df15-46df-aba9-336a5566ff8f-1&ckc=com.apple.clouddocs&ckz=com.apple.CloudDocs&p=24&s=vRQTKS_EjppZYbvpXk4AnvHw5do&cd=i' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** First of all, I like how structured and detail documented android library is.  Compare to web development where concerns are easily mixed together, android library clearly separates view concerns vs data model concerns vs business logic.  This is pretty nice.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** An adapter is a bridge between data and view.  It provides access to data items in that view. ArrayAdapter is important because it creates a view for each data object in the array and allow access to each item.  convertView is a view that can be reused from the first time app calls getView method.

## Notes

Describe any challenges encountered while building the app.

## License

    Copyright [2017] Pamela Lu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




