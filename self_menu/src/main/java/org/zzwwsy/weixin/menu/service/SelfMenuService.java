package org.zzwwsy.weixin.menu.service;

import org.zzwwsy.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu getMenu();

	void saveMenu(SelfMenu selfMenu);

}
