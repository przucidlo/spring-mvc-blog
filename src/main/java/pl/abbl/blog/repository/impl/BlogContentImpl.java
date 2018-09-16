package pl.abbl.blog.repository.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
		return entityManagerFactory.createEntityManager().find(BlogPost.class, id);
	}

	@Override
	public List<BlogPost> getLatestPostsByRange(int range) {
		Query query = entityManagerFactory.createEntityManager().createQuery("FROM blogposts");
		query.setMaxResults(range);
		List<BlogPost> blogPosts = query.getResultList();
		Collections.reverse(blogPosts);
		return blogPosts;
	}

	@Override
	public List<BlogPost> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
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
		
	}

	@Override
	public void removePost(String id) {
		// TODO Auto-generated method stub
		
	}

}
