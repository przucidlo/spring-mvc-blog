package pl.abbl.blog.repository.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BlogPost> getAllPosts() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<BlogPost> blogPosts = entityManager.createQuery("FROM blogposts").getResultList();
		
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
	public void removePost(String id) {
	
	}

}
