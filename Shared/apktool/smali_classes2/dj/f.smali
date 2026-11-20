.class public final synthetic Ldj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# instance fields
.field public final synthetic a:Ldj/m;

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Landroid/app/Activity;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/f;->a:Ldj/m;

    iput-boolean p2, p0, Ldj/f;->b:Z

    iput-wide p3, p0, Ldj/f;->c:J

    iput-object p5, p0, Ldj/f;->d:Ljava/lang/String;

    iput-object p6, p0, Ldj/f;->e:Ljava/lang/String;

    iput-object p7, p0, Ldj/f;->f:Landroid/app/Activity;

    iput-object p8, p0, Ldj/f;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 10

    iget-object v0, p0, Ldj/f;->a:Ldj/m;

    iget-boolean v1, p0, Ldj/f;->b:Z

    iget-wide v2, p0, Ldj/f;->c:J

    iget-object v4, p0, Ldj/f;->d:Ljava/lang/String;

    iget-object v5, p0, Ldj/f;->e:Ljava/lang/String;

    iget-object v6, p0, Ldj/f;->f:Landroid/app/Activity;

    iget-object v7, p0, Ldj/f;->g:Ljava/lang/String;

    move-object v8, p1

    move-object v9, p2

    invoke-static/range {v0 .. v9}, Ldj/m;->r(Ldj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
