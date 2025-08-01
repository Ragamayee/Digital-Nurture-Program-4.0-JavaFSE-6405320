import React from 'react';

function CourseDetails({ courses }) {
  const hasCourses = courses.length > 0;

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {hasCourses && (
        <ul>
          {courses.map((course) => (
            <li key={course.id}>
              {course.name} - {course.date}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default CourseDetails;
