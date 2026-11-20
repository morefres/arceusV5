.class public final synthetic Ldj/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/m$q;


# instance fields
.field public final synthetic a:Ldj/m;

.field public final synthetic b:Ldj/c;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ldj/m;Ldj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/k;->a:Ldj/m;

    iput-object p2, p0, Ldj/k;->b:Ldj/c;

    iput-wide p3, p0, Ldj/k;->c:J

    iput-object p5, p0, Ldj/k;->d:Ljava/lang/String;

    iput-object p6, p0, Ldj/k;->e:Ljava/lang/String;

    iput-object p7, p0, Ldj/k;->f:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 8

    iget-object v0, p0, Ldj/k;->a:Ldj/m;

    iget-object v1, p0, Ldj/k;->b:Ldj/c;

    iget-wide v2, p0, Ldj/k;->c:J

    iget-object v4, p0, Ldj/k;->d:Ljava/lang/String;

    iget-object v5, p0, Ldj/k;->e:Ljava/lang/String;

    iget-object v6, p0, Ldj/k;->f:Landroid/app/Activity;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Ldj/m;->t(Ldj/m;Ldj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method
