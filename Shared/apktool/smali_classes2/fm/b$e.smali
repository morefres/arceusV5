.class public Lfm/b$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/b;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfm/b;


# direct methods
.method public constructor <init>(Lfm/b;)V
    .locals 0

    iput-object p1, p0, Lfm/b$e;->a:Lfm/b;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfm/b$e;->a:Lfm/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lfm/b;->c(Lfm/b;Z)V

    iget-object v0, p0, Lfm/b$e;->a:Lfm/b;

    invoke-virtual {v0}, Lfm/b;->q()V

    return-void
.end method
