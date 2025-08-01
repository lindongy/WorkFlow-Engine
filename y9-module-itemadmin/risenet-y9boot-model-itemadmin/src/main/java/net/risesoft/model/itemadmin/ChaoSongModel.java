package net.risesoft.model.itemadmin;

import java.io.Serializable;

import lombok.Data;

import net.risesoft.enums.ChaoSongStatusEnum;

/**
 * 抄送信息模型
 *
 * @author qinman
 * @author zhangchongjie
 * @date 2022/12/20
 */
@Data
public class ChaoSongModel extends ChaoSongBaseModel implements Serializable {

    private static final long serialVersionUID = -4235779237483037821L;

    /**
     * 传阅的状态
     */
    private Integer status = ChaoSongStatusEnum.UNREAD.getValue();
}
