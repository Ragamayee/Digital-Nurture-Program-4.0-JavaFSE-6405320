import React from 'react';

function BlogDetails({ blogs }) {
  if (!blogs.length) return null; 

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <strong>{blog.author}</strong>
          <p>{blog.body}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
