.class public final synthetic Ldj/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/m$q;


# instance fields
.field public final synthetic a:Ldj/m;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ldj/m;Ljava/util/Map;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/i;->a:Ldj/m;

    iput-object p2, p0, Ldj/i;->b:Ljava/util/Map;

    iput-boolean p3, p0, Ldj/i;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Ldj/i;->a:Ldj/m;

    iget-object v1, p0, Ldj/i;->b:Ljava/util/Map;

    iget-boolean v2, p0, Ldj/i;->c:Z

    invoke-static {v0, v1, v2, p1}, Ldj/m;->p(Ldj/m;Ljava/util/Map;ZLjava/util/List;)V

    return-void
.end method
