package org.inspur.insight.server.entity;

    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author dky
* @since 2021-06-27
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Long principalId;

    private String userName;

    private Integer active;

    private Integer consecutiveFailures;

    private String activeWidgetLayouts;

    private String displayName;

    private String localUsername;

    private Long createTime;

    private Long version;


}
