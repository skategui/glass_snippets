.class final Lcom/google/glass/entity/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/common/base/aj;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/google/googlex/glass/common/proto/ac;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-static {p0}, Lcom/google/glass/entity/p;->a(Lcom/google/googlex/glass/common/proto/ac;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/google/glass/entity/p;->d(Lcom/google/googlex/glass/common/proto/ac;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0, v0}, Lcom/google/glass/entity/p;->a(Lcom/google/googlex/glass/common/proto/ac;Z)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/google/googlex/glass/common/proto/ac;

    invoke-static {p1}, Lcom/google/glass/entity/n;->a(Lcom/google/googlex/glass/common/proto/ac;)Z

    move-result v0

    return v0
.end method
