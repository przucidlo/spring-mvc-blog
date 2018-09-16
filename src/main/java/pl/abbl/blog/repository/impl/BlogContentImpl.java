package pl.abbl.blog.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.abbl.blog.model.BlogPost;
import pl.abbl.blog.repository.BlogContentRepository;

@Repository
public class BlogContentImpl implements BlogContentRepository{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public BlogPost getPostById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		BlogPost blogPost = entityManager.find(BlogPost.class, id);
		
		entityManager.close();
		
		return blogPost;
	}
	
	@Override
	public List<BlogPost> getAllPosts() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<BlogPost> query = entityManager.createQuery("FROM blogposts", BlogPost.class);
		List<BlogPost> blogPosts = query.getResultList();
		
		entityManager.close();
		
		return blogPosts;
	}

	
	@Override
	public List<BlogPost> getLatestPostsByRange(int range) {
		List<BlogPost> blogPosts = getAllPosts();
		
		return blogPosts.subList(Math.max(0, blogPosts.size() - range), blogPosts.size());
	}
	
	@Override
	public List<BlogPost> getPostsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogPost> getPostsByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPost(BlogPost blogPost) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		
		txn.begin();
		entityManager.persist(blogPost);
		txn.commit();
		
		entityManager.close();
	}

	@Override
	public void removePost(int id) {
		BlogPost blogPost = getPostById(id);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		
		txn.begin();
		entityManager.remove(entityManager.contains(blogPost) ? blogPost : entityManager.merge(blogPost));
		txn.commit();
		
		entityManager.close();
	}
}
