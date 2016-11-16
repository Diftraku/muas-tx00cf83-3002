package task12;

import java.util.ArrayList;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 * @see "https://en.wikipedia.org/wiki/Proxy_pattern#Java"
 */
class ProxyExample {

    /**
     * Test method
     */
    public static void main(String[] args) {
        ArrayList<Image> photoFolder = new ArrayList<>();
        photoFolder.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoFolder.add(new ProxyImage("HiRes_10MB_Photo2"));
        photoFolder.add(new ProxyImage("HiRes_10MB_Photo3"));
        photoFolder.add(new ProxyImage("HiRes_10MB_Photo4"));
        photoFolder.add(new ProxyImage("HiRes_10MB_Photo5"));

        System.out.println("Photo Folder has the following photos:");
        for (Image photo :
                photoFolder) {
            System.out.println(photo.showData());
        }

        photoFolder.get(2).displayImage();
        photoFolder.get(4).displayImage();
        photoFolder.get(2).displayImage();
    }

}
