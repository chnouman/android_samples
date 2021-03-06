package lecho.sample.green_dao.dao;

import java.util.List;
import lecho.sample.green_dao.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PLACE.
 */
public class Place {

    private Long id;
    private String name;
    private String code;
    private String description;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PlaceDao myDao;

    private List<Faculty> facultyList;
    private List<Category> categoryList;

    public Place() {
    }

    public Place(Long id) {
        this.id = id;
    }

    public Place(Long id, String name, String code, String description) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPlaceDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Faculty> getFacultyList() {
        if (facultyList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FacultyDao targetDao = daoSession.getFacultyDao();
            List<Faculty> facultyListNew = targetDao._queryPlace_FacultyList(id);
            synchronized (this) {
                if(facultyList == null) {
                    facultyList = facultyListNew;
                }
            }
        }
        return facultyList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetFacultyList() {
        facultyList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Category> getCategoryList() {
        if (categoryList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CategoryDao targetDao = daoSession.getCategoryDao();
            List<Category> categoryListNew = targetDao._queryPlace_CategoryList(id);
            synchronized (this) {
                if(categoryList == null) {
                    categoryList = categoryListNew;
                }
            }
        }
        return categoryList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetCategoryList() {
        categoryList = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
