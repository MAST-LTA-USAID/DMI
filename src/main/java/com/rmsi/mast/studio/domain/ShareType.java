package com.rmsi.mast.studio.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SocialTenureRelationType
 *
 * @author Shruti.Thakur
 */
@Entity
@Table(name = "share_type")
public class ShareType implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int SHARE_MULTIPLE_COMMON = 1;
    public static final int SHARE_SINGLE = 2;
    public static final int SHARE_MULTIPLE_JOINT = 3;
    public static final int SHARE_ADMINISTRATOR = 4;
    public static final int SHARE_GUARDIAN = 5;
    public static final int SHARE_INSTITUTION = 6;

    @Id
    private int gid;

    @Column(name = "share_type", nullable = false)
    private String shareType;

    @Column(name = "share_type_sw")
    private String shareType_sw;

    public ShareType() {
        super();
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getShareType_sw() {
        return shareType_sw;
    }

    public void setShareType_sw(String shareType_sw) {
        this.shareType_sw = shareType_sw;
    }

}
