.class public final synthetic Lfp/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/e0;

.field public final synthetic b:Lep/e;


# direct methods
.method public synthetic constructor <init>(Lfp/e0;Lep/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/w;->a:Lfp/e0;

    iput-object p2, p0, Lfp/w;->b:Lep/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfp/w;->a:Lfp/e0;

    iget-object v1, p0, Lfp/w;->b:Lep/e;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/a;

    invoke-static {v0, v1, p1}, Lfp/e0;->z(Lfp/e0;Lep/e;Lcom/withpersona/sdk2/inquiry/internal/network/a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
