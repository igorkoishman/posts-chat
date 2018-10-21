package core.repository;

import core.repository.model.PostDBO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by gkatzioura on 6/3/16.
 */
@Repository
@Transactional(readOnly = false)
public class PostRepositoryImpl implements PostRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Iterable<PostDBO> findPosts(List<Long> postIds) {
		Query nativeQuery = entityManager.createNativeQuery("SELECT `post_id`,`post` FROM `post` p WHERE p.`post_id` IN (?1) ;", PostDBO.class);
		nativeQuery.setParameter(1, postIds);
		return nativeQuery.getResultList();
	}
}