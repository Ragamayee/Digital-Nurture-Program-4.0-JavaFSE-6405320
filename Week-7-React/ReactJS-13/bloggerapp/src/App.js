import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

import { books } from './data/books';
import { blogs } from './data/blogs';
import { courses } from './data/courses';

function App() {
  return (
    <div className="App">
      <div style={{ display: 'flex', justifyContent: 'space-around' }}>
        <CourseDetails courses={courses} />

        <BookDetails books={books} />
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;
