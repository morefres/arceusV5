.class public final synthetic Lho/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lho/y;

.field public final synthetic b:Lar/w1;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;


# direct methods
.method public synthetic constructor <init>(Lho/y;Lar/w1;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/u;->a:Lho/y;

    iput-object p2, p0, Lho/u;->b:Lar/w1;

    iput-object p3, p0, Lho/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lho/u;->a:Lho/y;

    iget-object v1, p0, Lho/u;->b:Lar/w1;

    iget-object v2, p0, Lho/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    invoke-static {v0, v1, v2, p1}, Lho/y;->h(Lho/y;Lar/w1;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Landroid/view/View;)V

    return-void
.end method
