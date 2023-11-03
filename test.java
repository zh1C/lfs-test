package lfs

import (
	"encoding/base64"
	"encoding/json"
	"fmt"
	"strconv"

	"github.com/garyburd/redigo/redis"
	"github.com/gin-gonic/gin"

	"meituan.com/pkg/log"
	"meituan.com/pkg/squirrel"
	"meituan.com/pkg/util"
)

type unLock func() (bool, error)

type lock struct {
	proxySquirrel *squirrel.ProxySquirrel
	lockInfo      *LockInfo
}
