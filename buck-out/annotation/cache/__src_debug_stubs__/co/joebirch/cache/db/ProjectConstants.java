package co.joebirch.cache.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lco/joebirch/cache/db/ProjectConstants;", "", "()V", "COLUMN_IS_BOOKMARKED", "", "COLUMN_PROJECT_ID", "DELETE_PROJECTS", "QUERY_BOOKMARKED_PROJECTS", "QUERY_PROJECTS", "QUERY_UPDATE_BOOKMARK_STATUS", "TABLE_NAME", "src_debug"})
public final class ProjectConstants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "projects";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLUMN_PROJECT_ID = "project_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLUMN_IS_BOOKMARKED = "is_bookmarked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_PROJECTS = "SELECT * FROM projects";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_PROJECTS = "DELETE FROM projects";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_BOOKMARKED_PROJECTS = "SELECT * FROM projects WHERE is_bookmarked = 1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_UPDATE_BOOKMARK_STATUS = "UPDATE projects SET is_bookmarked = :isBookmarked WHERE project_id = :projectId";
    public static final co.joebirch.cache.db.ProjectConstants INSTANCE = null;
    
    private ProjectConstants() {
        super();
    }
}