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
    public class Hosts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long hostId;

    private String hostName;

    private Integer cpuCount;

    private String cpuInfo;

    private String discoveryStatus;

    private String hostAttributes;

    private String ipv4;

    private String ipv6;

    private Long lastRegistrationTime;

    private String osArch;

    private String osInfo;

    private String osType;

    private Integer phCpuCount;

    private String publicHostName;

    private String rackInfo;

    private Long totalMem;


}
